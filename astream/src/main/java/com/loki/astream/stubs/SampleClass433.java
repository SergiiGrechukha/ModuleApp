package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass433 {

    @Ignore    private SampleClass434 sampleClass;

    public SampleClass433(){
        sampleClass = new SampleClass434();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}