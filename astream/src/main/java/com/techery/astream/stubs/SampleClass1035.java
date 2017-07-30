package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1035 {

    @Ignore    private SampleClass1036 sampleClass;

    public SampleClass1035(){
        sampleClass = new SampleClass1036();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}