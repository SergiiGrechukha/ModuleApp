package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass754 {

    @Ignore    private SampleClass755 sampleClass;

    public SampleClass754(){
        sampleClass = new SampleClass755();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}