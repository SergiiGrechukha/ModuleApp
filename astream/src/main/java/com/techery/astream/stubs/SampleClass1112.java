package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1112 {

    @Ignore    private SampleClass1113 sampleClass;

    public SampleClass1112(){
        sampleClass = new SampleClass1113();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}