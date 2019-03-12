ALTER TABLE bill
    ADD CONSTRAINT bill_businesstrip_fk FOREIGN KEY ( businesstrip_idbt )
        REFERENCES businesstrip ( idbt ); 
        
ALTER TABLE billItem
    ADD CONSTRAINT billitem_bill_fk FOREIGN KEY ( bill_idb )
        REFERENCES bill ( idb );
        
ALTER TABLE businesstrip
    ADD CONSTRAINT businesstrip_destination_fk FOREIGN KEY ( destination_idd )
        REFERENCES destination ( idd ); 

      
ALTER TABLE businesstrip
    ADD CONSTRAINT businesstrip_tripstatus_fk FOREIGN KEY ( tripstatus_idts )
        REFERENCES tripstatus ( idts );    
 
 ALTER TABLE businesstrip
    ADD CONSTRAINT businesstrip_bill_fk FOREIGN KEY ( bill_idb )
        REFERENCES bill ( idb );
		
    
 ALTER TABLE destinationwage
    ADD CONSTRAINT destinationwage_destination_fk FOREIGN KEY ( destination_idd )
        REFERENCES destination ( idd );        
    
 ALTER TABLE destinationwage
    ADD CONSTRAINT destinationwage_wage_fk FOREIGN KEY ( wage_idw )
        REFERENCES wage ( idw );
        

 ALTER TABLE employee
    ADD CONSTRAINT employee_employeestatus_fk FOREIGN KEY ( employeestatus_ides )
        REFERENCES employeestatus ( ides );
      

ALTER TABLE tripofemployee
    ADD CONSTRAINT tripofemployee_businesstrip_fk FOREIGN KEY ( businesstrip_idbt )
        REFERENCES businesstrip ( idbt );

ALTER TABLE tripofemployee
    ADD CONSTRAINT tripofemployee_employee_fk FOREIGN KEY ( employee_ide )
        REFERENCES employee ( ide );
        

ALTER TABLE users
    ADD CONSTRAINT users_employee_fk FOREIGN KEY ( employee_ide )
        REFERENCES employee ( ide );
        
ALTER TABLE users
    ADD CONSTRAINT users_role_fk FOREIGN KEY ( role_idr )
        REFERENCES role ( idr );

        
        
        
