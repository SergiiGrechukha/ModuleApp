package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass166 {

    @Ignore    private SampleClass167 sampleClass;

    public SampleClass166(){
        sampleClass = new SampleClass167();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}