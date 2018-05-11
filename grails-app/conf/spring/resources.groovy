// Place your Spring DSL code here
beans = {
    //防止hibernate session报错
    openSessionInViewFilter(org.springframework.orm.hibernate4.support.OpenSessionInViewFilter) {}
}
