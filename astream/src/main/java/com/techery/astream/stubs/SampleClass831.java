package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass831 {

    @Ignore    private SampleClass832 sampleClass;

    public SampleClass831(){
        sampleClass = new SampleClass832();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}