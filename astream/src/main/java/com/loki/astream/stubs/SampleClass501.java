package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass501 {

    @Ignore    private SampleClass502 sampleClass;

    public SampleClass501(){
        sampleClass = new SampleClass502();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}