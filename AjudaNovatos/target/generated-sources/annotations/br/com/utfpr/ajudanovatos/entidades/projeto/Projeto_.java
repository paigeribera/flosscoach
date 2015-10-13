package br.com.utfpr.ajudanovatos.entidades.projeto;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Projeto.class)
public abstract class Projeto_ {

	public static volatile SingularAttribute<Projeto, String> main_language_name;
	public static volatile SingularAttribute<Projeto, Integer> total_commit_count;
	public static volatile SingularAttribute<Projeto, Integer> total_code_lines;
	public static volatile SingularAttribute<Projeto, String> homepage_url;
	public static volatile SingularAttribute<Projeto, Entendendo_Codigo> entendendoCodigo;
	public static volatile SingularAttribute<Projeto, String> description;
	public static volatile SingularAttribute<Projeto, String> created_at;
	public static volatile ListAttribute<Projeto, Plataforma> plataformas;
	public static volatile SingularAttribute<Projeto, Comunicacao> comunicacao;
	public static volatile SingularAttribute<Projeto, Requisito> requisito;
	public static volatile SingularAttribute<Projeto, String> download_url;
	public static volatile ListAttribute<Projeto, AtividadeMensal> atividade_mensal;
	public static volatile ListAttribute<Projeto, Licenca> licencas;
	public static volatile ListAttribute<Projeto, Link> links;
	public static volatile SingularAttribute<Projeto, Long> id;
	public static volatile SingularAttribute<Projeto, String> medium_logo_url;
	public static volatile SingularAttribute<Projeto, Integer> total_contributor_count;
	public static volatile ListAttribute<Projeto, Repositorio> repositorios;
	public static volatile SingularAttribute<Projeto, String> small_logo_url;
	public static volatile SingularAttribute<Projeto, Submeter_Mudanca> submeterMudanca;
	public static volatile SingularAttribute<Projeto, Como_Iniciar> comoIniciar;
	public static volatile SingularAttribute<Projeto, Integer> user_count;
	public static volatile SingularAttribute<Projeto, String> html_url;
	public static volatile SingularAttribute<Projeto, String> name;
	public static volatile ListAttribute<Projeto, Contribuinte> contribuintes;
	public static volatile SingularAttribute<Projeto, Long> usuario;
	public static volatile SingularAttribute<Projeto, Configurar_Workspace> configurarWorkspace;
	public static volatile ListAttribute<Projeto, Linguagem> linguagens;

}

