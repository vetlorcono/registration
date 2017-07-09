package pl.zymon.security;

public interface ISecurityUserService {

    String validatePasswordResetToken(long id, String token);

}
