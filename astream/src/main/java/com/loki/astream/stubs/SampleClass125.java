package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass125 {

    @Ignore    private SampleClass126 sampleClass;

    public SampleClass125(){
        sampleClass = new SampleClass126();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}