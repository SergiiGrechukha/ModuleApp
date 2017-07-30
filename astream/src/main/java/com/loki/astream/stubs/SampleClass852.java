package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass852 {

    @Ignore    private SampleClass853 sampleClass;

    public SampleClass852(){
        sampleClass = new SampleClass853();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}