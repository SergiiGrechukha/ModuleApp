package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1082 {

    @Ignore    private SampleClass1083 sampleClass;

    public SampleClass1082(){
        sampleClass = new SampleClass1083();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}