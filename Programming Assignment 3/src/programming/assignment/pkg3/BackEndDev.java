/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming.assignment.pkg3;
//importing calendar for finding current year
import java.util.Calendar;

/**
 *
 * @author ahnaf
 */

//declaring class BackEndDev
public class BackEndDev extends DBA {
    //initializing variables for BackendDev
    public String working_since;
    private String project_name;
    private int team_members;
    public boolean scrum_master;
    private String server_side_framework;
   
    
    public BackEndDev(String name, int id, double salary, String working_since){
        this.name=name;
        this.id=id;
        this.salary=salary;
        this.working_since=working_since;
        
       
        
        
    }
    

    
    void printEmploymentYears(String working_since){
        int i= Integer.parseInt(working_since);
        //finding integer value of current year
        int currentyear= Calendar.getInstance().get(Calendar.YEAR);
        int years=currentyear-i;
        System.out.println("Employed for: " + years + " years.");
        
    }
    
    void assignProject(String project_name, int team_members, String server_side_framework){
        this.project_name=project_name;
        this.team_members=team_members;
        this.server_side_framework=server_side_framework;
        
    }
    
    void printAssignedProject(){
        System.out.println("Project name: " + project_name+ " No. of team members: " + team_members + " Server side framework: " + server_side_framework);
    }
    
    
    
    
}
