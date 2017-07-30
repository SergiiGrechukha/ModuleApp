package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass791 {

    @Ignore    private SampleClass792 sampleClass;

    public SampleClass791(){
        sampleClass = new SampleClass792();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}