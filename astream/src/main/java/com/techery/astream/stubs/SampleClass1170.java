package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1170 {

    @Ignore    private SampleClass1171 sampleClass;

    public SampleClass1170(){
        sampleClass = new SampleClass1171();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}