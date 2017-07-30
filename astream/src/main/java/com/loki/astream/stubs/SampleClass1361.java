package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass1361 {

    @Ignore    private SampleClass1362 sampleClass;

    public SampleClass1361(){
        sampleClass = new SampleClass1362();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}