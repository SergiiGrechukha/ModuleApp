package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1188 {

    @Ignore    private SampleClass1189 sampleClass;

    public SampleClass1188(){
        sampleClass = new SampleClass1189();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}