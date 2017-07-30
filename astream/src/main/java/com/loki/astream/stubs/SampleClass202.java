package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass202 {

    @Ignore    private SampleClass203 sampleClass;

    public SampleClass202(){
        sampleClass = new SampleClass203();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}