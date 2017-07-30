package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1886 {

    @Ignore    private SampleClass1887 sampleClass;

    public SampleClass1886(){
        sampleClass = new SampleClass1887();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}