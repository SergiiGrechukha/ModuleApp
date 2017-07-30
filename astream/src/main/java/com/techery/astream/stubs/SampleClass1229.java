package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1229 {

    @Ignore    private SampleClass1230 sampleClass;

    public SampleClass1229(){
        sampleClass = new SampleClass1230();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}