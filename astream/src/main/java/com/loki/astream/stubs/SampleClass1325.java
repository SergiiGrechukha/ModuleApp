package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1325 {

    @Ignore    private SampleClass1326 sampleClass;

    public SampleClass1325(){
        sampleClass = new SampleClass1326();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}