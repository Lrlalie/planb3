package fr.planb.gr.model;


import java.io.Serializable;
import javax.persistence.*;

	/** 
	 * @author Laurence REYNIER
	 *
	 */
	@Entity (name = "personne")
	@Table(name="tpersonne")
	public class User extends Person implements Serializable{		

		/**
		 * author Laurence REYNIER
		 */
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name = "idUtilisateur", length = 19, nullable= true, unique = true)
		private long idUser;	
		
		//login
		@Basic(optional =  false)
		@Column(name = "identifiant", length = 255, nullable= true, unique = true)
		private String identifiant;
		
		//password1
		@Basic(optional =  false)
		@Column(name = "mot de passe", length = 255, nullable= true, unique = true)
		private String password1;	
		
		//password2 : confirmation's password1, I use the annotation : Transient, because I don't want to generate
		//a column in database
		@Transient
		private String password2;	
		
		//role
		@Basic(optional =  false)
		@Column(name = "role", length = 255, nullable= true, unique = true)
		private String role;	
		
		
		
	}


