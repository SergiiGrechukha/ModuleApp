package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass474 {

    @Ignore    private SampleClass475 sampleClass;

    public SampleClass474(){
        sampleClass = new SampleClass475();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}