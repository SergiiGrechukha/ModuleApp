package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass188 {

    @Ignore    private SampleClass189 sampleClass;

    public SampleClass188(){
        sampleClass = new SampleClass189();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}