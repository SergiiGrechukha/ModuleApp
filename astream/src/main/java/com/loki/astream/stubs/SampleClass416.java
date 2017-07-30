package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass416 {

    @Ignore    private SampleClass417 sampleClass;

    public SampleClass416(){
        sampleClass = new SampleClass417();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}