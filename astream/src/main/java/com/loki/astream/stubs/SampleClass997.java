package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass997 {

    @Ignore    private SampleClass998 sampleClass;

    public SampleClass997(){
        sampleClass = new SampleClass998();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}