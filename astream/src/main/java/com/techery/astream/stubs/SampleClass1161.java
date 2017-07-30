package com.techery.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1161 {

    @Ignore    private SampleClass1162 sampleClass;

    public SampleClass1161(){
        sampleClass = new SampleClass1162();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}