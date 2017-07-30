package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass298 {

    @Ignore    private SampleClass299 sampleClass;

    public SampleClass298(){
        sampleClass = new SampleClass299();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}