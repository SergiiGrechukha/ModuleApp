package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1357 {

    @Ignore    private SampleClass1358 sampleClass;

    public SampleClass1357(){
        sampleClass = new SampleClass1358();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}