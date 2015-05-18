// import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.AuthenticationServiceException;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
//import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
//
//import javax.servlet.FilterChain;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//public class CustomTokenAuthenticationFilter extends AbstractAuthenticationProcessingFilter {
//
//    private AuthenticationManager authenticationManager;
//
//
//    public CustomTokenAuthenticationFilter(String defaultFilterProcessesUrl, AuthenticationManager authenticationManager) {
//        super(defaultFilterProcessesUrl);
//        this.authenticationManager = authenticationManager;
//        super.setRequiresAuthenticationRequestMatcher(new AntPathRequestMatcher(defaultFilterProcessesUrl));
//        setAuthenticationManager(new NoOpAuthenticationManager());
//        setAuthenticationSuccessHandler(new TokenSimpleUrlAuthenticationSuccessHandler());
//    }
//
//    public final String HEADER_SECURITY_TOKEN = "My-Rest-Token";
//
//    @Override
//    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException, IOException, ServletException {
//        String token = request.getHeader(HEADER_SECURITY_TOKEN);
//        Authentication userAuthenticationToken = parseToken(token);
//        if (userAuthenticationToken == null) {
//            throw new AuthenticationServiceException("here we throw some exception or text");
//        }
//        return userAuthenticationToken;
//    }
//
//    @Override
//    protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain, Authentication authResult) throws IOException, ServletException {
//        super.successfulAuthentication(request, response, chain, authResult);
//        chain.doFilter(request, response);
//    }
//
//    // This method makes some validation depend on your application logic
//    private Authentication parseToken(String tokenString) {
//        try {
//            String encryptedToken = cryptService.decrypt(tokenString);
//            Token token = new ObjectMapper().readValue(encryptedToken, Token.class);
//            return authenticationManager.authenticate(
//                    new UsernamePasswordAuthenticationToken(token.getUsername(), token.getPassword()));
//        } catch (Exception e) {
//            return null;
//        }
//        return null;
//    }
//}
