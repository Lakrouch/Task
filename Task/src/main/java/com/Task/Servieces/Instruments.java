package com.Task.Servieces;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Instruments {

    public boolean valid(String email, String mobile){
        if ((email.indexOf("@")!=-1)&&(email.indexOf(".")!=-1)){
            if (mobile.substring(0, 4).equals("+375")){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;

        }
    }



}
