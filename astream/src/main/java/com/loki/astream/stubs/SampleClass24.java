package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass24 {

    @Ignore    private SampleClass25 sampleClass;

    public SampleClass24(){
        sampleClass = new SampleClass25();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}