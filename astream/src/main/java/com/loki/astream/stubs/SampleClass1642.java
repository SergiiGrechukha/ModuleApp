package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1642 {

    @Ignore    private SampleClass1643 sampleClass;

    public SampleClass1642(){
        sampleClass = new SampleClass1643();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}