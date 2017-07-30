package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass437 {

    @Ignore    private SampleClass438 sampleClass;

    public SampleClass437(){
        sampleClass = new SampleClass438();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}