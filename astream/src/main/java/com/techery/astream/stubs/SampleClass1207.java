package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1207 {

    @Ignore    private SampleClass1208 sampleClass;

    public SampleClass1207(){
        sampleClass = new SampleClass1208();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}