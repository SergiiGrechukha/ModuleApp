package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1178 {

    @Ignore    private SampleClass1179 sampleClass;

    public SampleClass1178(){
        sampleClass = new SampleClass1179();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}