package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1089 {

    @Ignore    private SampleClass1090 sampleClass;

    public SampleClass1089(){
        sampleClass = new SampleClass1090();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}