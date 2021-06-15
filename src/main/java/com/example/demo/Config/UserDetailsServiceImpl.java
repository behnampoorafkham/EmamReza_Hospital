package com.example.demo.Config;

import com.example.demo.Repository.persons.DoctorRep;
import com.example.demo.Repository.persons.NurseRep;
import com.example.demo.Repository.persons.PatientRep;
import com.example.demo.model.persons.Doctor;
import com.example.demo.model.persons.Nurse;
import com.example.demo.model.persons.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Set;


@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private DoctorRep doctorRep;

    @Autowired
    private PatientRep patientRep;

    @Autowired
    private NurseRep nurseRep;

    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Doctor doctor = doctorRep.findByName(username.toLowerCase());
        Nurse nurse = nurseRep.findByName(username.toLowerCase());
        Patient patient = patientRep.findByName(username.toLowerCase());
        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();

        if (doctor!=null){
            grantedAuthorities.add(new SimpleGrantedAuthority("doctor"));
            return new org.springframework.security.core.userdetails.User(doctor.getName(), doctor.getPassword(), grantedAuthorities);
        }else if (nurse!=null){
            grantedAuthorities.add(new SimpleGrantedAuthority("nurse"));
            return new org.springframework.security.core.userdetails.User(nurse.getName(), nurse.getPassword(), grantedAuthorities);
        }else if (patient!=null){
            grantedAuthorities.add(new SimpleGrantedAuthority("patient"));
            return new org.springframework.security.core.userdetails.User(patient.getName(), patient.getPassword(), grantedAuthorities);
        }else {
            throw new UsernameNotFoundException("User Not Found :"+username);
        }
    }

}