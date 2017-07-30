package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1725 {

    @Ignore    private SampleClass1726 sampleClass;

    public SampleClass1725(){
        sampleClass = new SampleClass1726();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}