package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass853 {

    @Ignore    private SampleClass854 sampleClass;

    public SampleClass853(){
        sampleClass = new SampleClass854();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}