package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass986 {

    @Ignore    private SampleClass987 sampleClass;

    public SampleClass986(){
        sampleClass = new SampleClass987();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}