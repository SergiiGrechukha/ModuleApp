package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass464 {

    @Ignore    private SampleClass465 sampleClass;

    public SampleClass464(){
        sampleClass = new SampleClass465();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}