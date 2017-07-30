package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass275 {

    @Ignore    private SampleClass276 sampleClass;

    public SampleClass275(){
        sampleClass = new SampleClass276();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}