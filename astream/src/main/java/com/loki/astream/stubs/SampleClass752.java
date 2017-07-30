package com.loki.astream.stubs;import com.jenzz.pojobuilder.api.Builder;import com.jenzz.pojobuilder.api.Ignore;

@Builder public class SampleClass752 {

    @Ignore    private SampleClass753 sampleClass;

    public SampleClass752(){
        sampleClass = new SampleClass753();
    }

    public String getClassName() {
        return sampleClass.getClassName();
    }
}