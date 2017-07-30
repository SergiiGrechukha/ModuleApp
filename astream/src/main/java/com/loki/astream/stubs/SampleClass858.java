package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass858 {

    @Ignore    private SampleClass859 sampleClass;

    public SampleClass858(){
        sampleClass = new SampleClass859();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}