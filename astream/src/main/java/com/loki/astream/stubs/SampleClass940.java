package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass940 {

    @Ignore    private SampleClass941 sampleClass;

    public SampleClass940(){
        sampleClass = new SampleClass941();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}