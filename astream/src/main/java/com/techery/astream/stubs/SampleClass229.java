package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass229 {

    @Ignore    private SampleClass230 sampleClass;

    public SampleClass229(){
        sampleClass = new SampleClass230();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}