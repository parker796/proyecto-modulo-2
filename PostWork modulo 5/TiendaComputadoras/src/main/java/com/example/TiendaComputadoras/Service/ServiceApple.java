package com.example.TiendaComputadoras.Service;

import com.example.TiendaComputadoras.Repository.InterApple;
import com.example.TiendaComputadoras.Repository.InterDell;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceApple {
    private InterApple interApple;
    @Autowired
    public ServiceApple(InterApple interApple){
        this.interApple = interApple;
    }
}
