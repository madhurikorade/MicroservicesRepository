package com.eureka.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Countries
{
   @Id
   private Integer countryId;  
   private String name;
   private String currency;
   private String currencysimbol;
   private String language;
   private String capital;   
}
