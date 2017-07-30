package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass960 {

    @Ignore    private SampleClass961 sampleClass;

    public SampleClass960(){
        sampleClass = new SampleClass961();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}