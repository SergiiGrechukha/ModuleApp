package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass616 {

    @Ignore    private SampleClass617 sampleClass;

    public SampleClass616(){
        sampleClass = new SampleClass617();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}