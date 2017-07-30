package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1028 {

    @Ignore    private SampleClass1029 sampleClass;

    public SampleClass1028(){
        sampleClass = new SampleClass1029();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}